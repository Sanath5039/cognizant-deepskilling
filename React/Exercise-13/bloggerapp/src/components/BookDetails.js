function BookDetails(){
    const books = [
        {id:1,name:"Master React",price:670},
        {id:2,name:"Deep Dive into Angular",price:800},
        {id:3,name:"Mongo Essentials", price:450}
    ];
    return(
        <div>
            <h2> Book details </h2>
            {
                books.map((book)=>(
                    <div key={book.id}>

                        <h3> <b> {book.name} </b> </h3>
                        <h3> <b> {book.price} </b> </h3>

                    </div>
                ))
            }
        </div>
    );
}

export default BookDetails;