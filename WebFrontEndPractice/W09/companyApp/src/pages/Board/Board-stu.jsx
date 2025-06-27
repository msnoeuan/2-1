// ./src/page/Board/Board.jsx
import React, { useState } from "react";

function Board() {



  const dummyPosts = [
    {
      _id: 1,
      number: 1,
      title: "첫 번째 게시물",
      createdAt: "2023-11-01T10:00:00",
      views: 10,
    },
    {
      _id: 2,
      number: 2,
      title: "두 번째 게시물",
      createdAt: "2023-11-02T11:30:00",
      views: 20,
    },
    {
      _id: 3,
      number: 3,
      title: "세 번째 게시물",
      createdAt: "2023-11-03T14:00:00",
      views: 30,
    },
    {
      _id: 4,
      number: 4,
      title: "네 번째 게시물",
      createdAt: "2023-11-04T16:45:00",
      views: 40,
    },
    {
      _id: 5,
      number: 5,
      title: "다섯 번째 게시물",
      createdAt: "2023-11-05T09:15:00",
      views: 50,
    },
  ];


  

  return (
    <div className="p-4 md:p-6 max-w-7xl mx-auto py-32 md:py-32">
      <h1 className="text-4xl md:text-5xl font-bold mb-6 md:mb-8 text-center">
        업무 게시판
      </h1>


    </div>
  );
};

export default Board;