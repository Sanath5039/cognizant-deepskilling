function ListOfPlayers(){

    const players = [
        { name: "Rohit" , score:75},
        { name: "Virat" , score:38},
        { name: "KL Rahul" , score:78},
        { name: "Ishan" , score:51},
        { name: "Hardik" , score:83},
        { name: "Nithish" , score:23},
        { name: "Jadeja" , score:15},
        { name: "Ashwin" , score:45},
        { name: "Shami" , score:5},
        { name: "Bumrah" , score:45},
        { name: "Siraj" , score:45},

    ];

    const lowScore = players.filter(player=>player.score < 70);

    return(
        <div>
            <h2> List Of Players </h2>
            {
                players.map((player,index)=>(
                    <p key={index}> 
                        {player.name} - {player.score}
                    </p>
                ))
            }
            <h2> List of players score less than 70 </h2>
            {
                lowScore.map((player, index)=>(
                    <p key={index}>
                        {player.name} - {player.score}
                    </p>
                ))
            }
        </div>
    );

}

export default ListOfPlayers;
