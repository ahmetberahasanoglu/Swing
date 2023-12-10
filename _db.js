// Oyunlar incelemeler ve yazarlar için belirlenen typeları kullanarak kendimiz bir veritabanı olusturduk daha sonra bu değerleri export ettik
let games = [
    {id: '1',title:'Zelda, Tears of the Kingdom', platform:['Switch']},
    {id: '2',title:'Final Fantasy 7 Remake', platform:['PS5','PC']},
    {id: '3',title:'Elden Ring', platform:['PC','PS5','XBOX']},
]
let reviews = [
    {id: '1', rating: 9, content: 'Lorem ipsum', author_id:'1',game_id: '2'},
    {id: '2', rating: 5, content: 'Lorem ipsum', author_id:'2',game_id: '1'},
    {id: '3', rating: 7, content: 'Lorem ipsum', author_id:'2',game_id: '3'},
    {id: '4', rating: 8, content: 'Lorem ipsum', author_id:'3',game_id: '3'},
    {id: '5', rating: 8, content: 'Lorem ipsum', author_id:'1',game_id: '1'},
    {id: '6', rating: 10, content: 'Lorem ipsum', author_id:'2',game_id: '2'},
]
let authors = [
    {id: '1', name: 'George RR Martin',verified: true},
    {id: '2', name: 'Tolkien',verified: true},
    {id: '3', name: 'JK Rowling',verified: true},
]
export default {games,reviews,authors}
