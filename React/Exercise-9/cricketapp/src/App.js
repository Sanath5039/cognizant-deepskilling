import IndianPlayers from './components/IndianPlayers';
import ListOfPlayers from './components/ListOfPlayers';

function App() {
  const flag = true;
  if(flag){
    return (
      <div className="container">
        <ListOfPlayers />
      </div>
    );
  }
  else {
    return(
      <div className="container">
        <IndianPlayers />
      </div>
    );
  }
}

export default App;
