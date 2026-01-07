import React, { useEffect, useState } from "react";
import MovieCard from "../MovieCard/MovieCard";

function Home(){

    const [movies, setMovies] = useState([]);

    useEffect(()=>{
        fetch("https://jsonfakery.com/movies/paginated")
        .then(res=> {
            return res.json();
        })
        .then((data)=>{
            setMovies(data.data);
        })
    },[])

    return (
        <div>
            {
                movies.map((movie)=>{
                    return <MovieCard title={movie.original_title} imageUrl={movie.poster_path}/>
                })
            }
        </div>
    )
}

export default Home;