import logo from './logo.svg';
import './App.css';
import CalculateScore from './components/CalculateScore';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <CalculateScore 
          Name="Siddhu"
          School="CVR"
          Total={520}
          goal={6}
        />
      </header>

      
    </div>
  );
}

export default App;
