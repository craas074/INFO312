
/* Construct a shift object */
function shift(day, date, start, finish){
    
    this.day = day;
    this.date = date;
    this.start = start;
    this.finish = finish;
      
}

/* Array to hold shifts */
var map = new Map();


var selections = (function () {

    var pub = {};
    
    
    function setupChecks() {


        document.getElementById("table1").onclick = columnHandler;
        document.getElementById("table2").onclick = columnHandler;
        document.getElementById("table3").onclick = columnHandler;

        function columnHandler(e) {
            
            e = e || window.event; //for IE87 backward compatibility
            var t = e.target || e.srcElement; //IE87 backward compatibility
            while (t.nodeName !== 'TD' && t.nodeName !== 'TH' && t.nodeName !== 'TABLE') {
                t = t.parentNode;
            }
            if (t.nodeName === 'TABLE') {
                return;
            }
            var c = t.parentNode.cells;
            var j = 0;
            for (var i = 0; i < c.length; i++) {
                if (c[i] === t) {
                    j = i;
                }
            }
            

            if (t.style.backgroundColor === "rgb(9, 218, 160)" && t.innerHTML === '') {
                t.style.backgroundColor = null;
                //remove the day and time from the selection list
            } else {

                if (t.innerHTML === '') {
                    t.style.backgroundColor = "rgb(9, 218, 160)";
                }
                //console.log(c[0].innerHTML);
                //find the day and time, add it to some list     
            }
            
            var tableIdString = t.parentNode.parentNode.parentNode.getAttribute("id");
            var tableIdActual = document.getElementById(tableIdString);
            var day = tableIdActual.rows[0].cells[j].innerHTML;
            var id = tableIdActual.rows[0].cells[j].getAttribute("id");
            var time = c[0].innerHTML; // or can make the id a formatted time or specific value
            
            if (t.style.backgroundColor === "rgb(9, 218, 160)" && t.innerHTML === ''){
                console.log("Table: " + tableIdString + ", Day: " + day + ", Date: " + id + ", Time: " + time);
            }
            
            var newShift = new shift(day, id, time, time);
            map.set(newShift);
            console.log(map);
        }
    }

    pub.setup = function () {

        setupChecks();
        

    };

    return pub;

}());

$(document).ready(selections.setup);