import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Home from './component/Home/Home';
import MovieCard from './component/MovieCard/MovieCard';

function App() {
  return (
    <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/movie' element={<MovieCard/>}/>
        </Routes>
    </BrowserRouter>
  );
}

export default App;
