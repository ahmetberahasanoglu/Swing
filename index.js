//Kodlarınn hepsini FreeCodeCamp.org'un GraphQL for beginners kursunu izlerken yazdığımdan oradan alıntıdır
import { ApolloServer } from '@apollo/server';
import { startStandaloneServer } from '@apollo/server/standalone';

//yazılan database'i import ettim 
import _db from './_db.js';

//tOyunlar, incelemeler, yazarlar vs. için tipleri importladım
import { typeDefs } from './schema.js';

const resolvers ={//resolvers yani adresimize gönderdiğimizde yapacağımız çözümler/işlemleri belirledim
    Query: {//Query olmazsa olmaz bir resolverdır çünkü tüm Graphql dosylaarında bulunur
       games(){
        return _db.games
       },
       game(_, args){
        return _db.games.find((game)=>game.id === args.id) 
       },
       reviews(){
        return _db.reviews
       },
       review(_, args){
        return _db.reviews.find((review)=>review.id === args.id) 
       },
       authors(){
        return _db.authors
       },
       author(_, args){
        return _db.authors.find((author)=>author.id === args.id) 
       }
       
    },
    Game: {//oyunları ayrı bir şekilde aldığımızda da resolver alacak 
        reviews(parent){
            return _db.reviews.filter((r)=> r.game_id === parent.id)
        }
    },
    Author: {//Yazarları ayrı bir şekilde aldığımızda da resolver alacak 
        reviews(parent){
            return _db.reviews.filter((r)=> r.author_id === parent.id)
        }
    },
    Review:{//İncelemeleri ayrı bir şekilde aldığımızda da resolver alacak 
        game(parent){
            return _db.games.find((g)=>g.id === parent.game_id) 
        },
        author(parent){
            return _db.authors.find((a)=>a.id === parent.author_id) 
        }
    },
    Mutation: {//Mutation içinde oyunu sil ve oyunu ekle işlemlerimizi yazdık  
        deleteGame(_,args){
            _db.games =_db.games.filter((g) => g.id !== args.id)
            return _db.games
        },
        addGame(_, args){
            let game = {
                ...args.game,
                id: Math.floor(Math.random()*10000).toString()
            }
            _db.games.push(game)
            return game
        }
    }
}
// server setup
const server = new ApolloServer({//apolloservera bağlandık ve tanımladıgımız typedefleri ve resolverları gönderdik
typeDefs,resolvers 
})
const { url } = await startStandaloneServer(server,{
    listen:{ port:4000}
})
console.log('Server ready at port', 4000)//servera bağlandıgında terminalde bu yazıyor
