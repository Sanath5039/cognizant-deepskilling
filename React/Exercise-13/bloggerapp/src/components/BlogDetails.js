function BlogDetails(){
    const blogs = [
        {id:1,subject:"React Learning",author:"Stephen Biz",content:"Welcome to learning React"},
        {id:2,subject:"Installation",author:"Schewzdenier",content:"You can install react from npm"}
    ];
    return(
        <div>
            <h1> Blog Details </h1>
            {
                blogs.map((blog)=>(
                    <div key={blog.id}>
                        <h2> <b> {blog.subject} </b> </h2>
                        <h4> <b> {blog.author} </b> </h4>
                        <p> {blog.content} </p>
                    </div>    
                ))
            }
        </div>
    );
}

export default BlogDetails;