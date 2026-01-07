import React from 'react'
import './MovieCard.css'

const MovieCard = (props) => {


  return (
    <div className='card'>
        <img src={props.imageUrl} alt={`${props.title}.jpg`} width="100px" height="100px"/>
        <p className='title'>{props.title}</p>
    </div>
  )
}

export default MovieCard;
