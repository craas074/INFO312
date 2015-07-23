
var selections = (function () {

    var pub = {};
     
    function setupTask() {

        /* Setup onclick events for each table */
        document.getElementById("table1").onclick = handler;
        document.getElementById("table2").onclick = handler;
        document.getElementById("table3").onclick = handler;


        function handler(e) {

            /* Set up target */
            e = e || window.event; //for IE87 backward compatibility
            var t = e.target || e.srcElement; //IE87 backward compatibility
            var rowCells = t.parentNode.cells; //Get a collection of all cells in the clicked row
            
            /* Get the column number of the selected cell */
            var columnNumber = 0;
            for (var i = 0; i < rowCells.length; i++) {
                if (rowCells[i] === t) {
                    columnNumber = i;
                }
            }
           
            /* Ensure that specific parts of the table arent registered as selections */
            if (t.nodeName === 'TABLE' || t.nodeName === 'TH' || columnNumber === 0) {
                return;
            }

            setSelectionsVisible(t);
            addAndRemoveSelections(t, columnNumber, rowCells);
        
        } // End handler
        
        function setSelectionsVisible(t){
            
            /* Detect and set selection visibility with CSS */
            if (t.style.backgroundColor === "rgb(9, 218, 160)") {
                t.style.backgroundColor = null;
                //remove the day and time from the selection list
            } else {
                t.style.backgroundColor = "rgb(9, 218, 160)";     
            }     
            
        } // End setSelectionsVisible
        
        function addAndRemoveSelections(t, columnNumber, rowCells){
            
            /*  */
            var tableIdString = t.parentNode.parentNode.parentNode.getAttribute("id");
            var tableIdActual = document.getElementById(tableIdString);
            var day = tableIdActual.rows[0].cells[columnNumber].innerHTML;
            var id = tableIdActual.rows[0].cells[columnNumber].getAttribute("id");
            var time = rowCells[0].innerHTML; // or can make the id a formatted time or specific value
            
            console.log("Table: " + tableIdString + ", Day: " + day + ", Date: " + id + ", Time: " + time);

            var identifier = day + time + id;
            
            /* Check if the selection doesn't exist. If its doesn't, store (create) the shift. 
             * Otherwise, remove it as a stored selection */
            if (document.getElementById(identifier) === null) {

                //alert("doesn't exist, so create");
                $("#shifts").append("<input class='shifts' id='" + identifier + "' type='text' value='" + identifier + "' style='display: none'/>");

            } else {

                //alert("exists, so remove");
                //document.getElementById(identifier).getAttribute("id")
                //$(identifier).remove();
            
            }
            
            console.log(document.getElementById(identifier).getAttribute("id"));

            
        } // End addAndRemoveSelections
        
        
    }

    pub.setup = function () {

        setupTask();
       
    };

    return pub;

}());

$(document).ready(selections.setup);