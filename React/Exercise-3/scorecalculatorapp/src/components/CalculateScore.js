function CalculateScore(props) {
    const average = props.Total / props.goal;
    return(
        <div className="container">
            <h2> Student Management Protal </h2>
            <p><b>Name: </b>{props.Name}</p>
            <p><b>School: </b>{props.School}</p>
            <p><b>Total: </b>{props.Total}</p>
            <p><b>goal: </b>{props.goal}</p>
            <h3> Average Score: { average.toFixed(2) }</h3>
        </div>
    );
}

export default CalculateScore;