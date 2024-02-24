public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Slide Puzzel</title>
    <link rel="stylesheet" href="Puzzle.css">
    <script src="pu"
</head>

<body>
<img id="title" src="logo.png">
<div id="board"></div>
<h1>Turns: <span id="Turns"></span></h1>
</body>
</html>

body{
    font-family: Arial, Helvetica, sans-serif;
    text-align: center;
    color:  #0c67ae;

}
#title {
    height: 150px;
    width: 400px;
}

#board {
    width: 360px;
    height: 360px;
    background-color: lightblue;
    border: 10px solid #0c67ae;

    margin: 0 auto;
    display: flex;
    flex-wrap: wrap;
}

#board img{
    width: 118px;
    height: 118px;
    border: 1px solid #0c67ae;

}



var rows = 3;
var columns = 3;

var currTile;
var otherTils; //blank tile

var turns = 0;

var imgOrder = ["1","2","3","4","5","6","7","8","9"];

window.onload = function(){
for(let r=0; r < rows; r++){
    for(let c=0; c < columns; c++){

        //img id = "0-0"
        let tile = document.createElement("img");
        tile.id = r.toString() + "-" + c.toString();
        }
}

}