import { Component } from "react";

class Posts extends Component{
    constructor(props){
        super(props);
        this.state={
            posts : []
        };
    }

    loadPosts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(res => res.json())
        .then(data => {
            this.setState({posts:data});
        })
        .catch(err => {
            throw err;
        })
    }

    componentDidMount(){
        this.loadPosts();
    }
    
    render() {
        return(
            <div>
                <h1> Blog Posts </h1>
                {
                    this.state.posts.map(post => (
                        <div key={post.id}>
                            <h2> {post.title} </h2>
                            <p> {post.body} </p>
                            <hr />
                        </div> 
                    ))
                }
            </div>
        );
    }
    
    componentDidCatch(err, info){
        alert("Error " + err);
    }

}

export default Posts;