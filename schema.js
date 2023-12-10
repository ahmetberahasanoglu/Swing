//Kullanacağımız tipleri tanımladık ! işareti yalnızca o tipten değer alır anlamındadır
//title: String!  diyorsa title yalnızca String değer olur
//platform: [String!]! ise platform, yalnızca String değerleri alabilen ve bir değeri olması zorunlu olan bir ifadedir
export const typeDefs=`#graphql
type Game{
    id: ID!
    title: String!
    platform: [String!]!
    reviews: [Review!]
    

}
type Review{
    id:ID!
    rating: Int!
    content: String!
    game: Game!
    author: Author!
}
type Author{
    id:ID!
    name:String!
    verified:Boolean!
    reviews:[Review!]
}
type Query{
    reviews:[Review]
    review(id: ID!): Review
    games:[Game]
    game(id: ID!): Game
    authors:[Author]
    author(id: ID!): Author  
}
type Mutation {
    addGame(game: AddGameInput!): Game
    deleteGame(id:ID!):[Game]
}
input AddGameInput{
    title: String!,
    platform: [String!]!
}
`
