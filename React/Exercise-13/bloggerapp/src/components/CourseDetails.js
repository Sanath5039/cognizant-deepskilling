function CourseDetails(){
    const courses = [
        {id:1,name:"Angular",date:"4/5/2021"},
        {id:2,name:"React",date:"6/3/2021"}
        
    ];

    return(
        <div>
            <h2> Course details </h2>
            {
                courses.map( (course)=>(
                    <div key={course.id}>

                        <h3> <b> {course.name} </b> </h3>
                        <h5> {course.date} </h5>

                    </div>
                ))
            }
        </div>
    );
}

export default CourseDetails;