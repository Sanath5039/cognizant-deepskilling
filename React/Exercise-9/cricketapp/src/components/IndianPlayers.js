function IndianPlayers(){
    const players = [
        "Rohit",
        "Virat",
        "KL Rahul",
        "Ishan",
        "Nithish",
        "Jadeja",
        "Ashwin",
        "Bhumra"
    ]
    const [
        odd1,even1,
        odd2,even2,
        odd3,even3,
        odd4,even4,
    ] = players

    const oddPlayers = [odd1,odd2,odd3,odd4];
    const evenPlayers = [even1,even2,even3,even4];

    const T20Players = [
        "Virat","Rohith","KL Rahul","Ishan"
    ]

    const RanjiPlayers = [
        "Nithish","Jadeja","Ashwin","bhumra"
    ];

    const mergePlayers = [...T20Players, ...RanjiPlayers];
    return(
        <div>
            <h2> Odd Players </h2>
            {
                oddPlayers.map((player,index)=>(
                    <p key={index}>
                        {player}
                    </p>
                ))
            }
            <hr />
            <h2> Even Players </h2>
            {
                evenPlayers.map((player,index)=>(
                    <p key={index}>
                        {player}
                    </p>
                ))
            }

            <hr />

            <h2> Merged Players </h2>
            {
                mergePlayers.map((player,index)=>(
                    <p key={index}>
                        {player}
                    </p>
                ))
            }
        </div>
    )
}


export default IndianPlayers;