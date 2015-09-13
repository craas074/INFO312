
var selections = (function () {

    var pub = {};
     
    function setupTask() {

        /* Setup onclick events for each table */
        document.getElementById("table1").onclick = handler;
        document.getElementById("table2").onclick = handler;
        document.getElementById("table3").onclick = handler;

        /* Get bearings, i.e. the clicked cell, column number and a collection
         * of all cells in the clicked row. Once bearings are achieved, call methods
         * to add/remove the selection visibility (indicated with colored cell), and 
         * add/remove seleletions from the hold*/
        function handler(e) {

            /* Set up target */
            e = e || window.event; //for IE87 backward compatibility
            var targetCell = e.target || e.srcElement; //IE87 backward compatibility
            var rowCells = targetCell.parentNode.cells; //Get a collection of all cells in the clicked row

            /* Get the column number of the selected cell */
            var columnNumber = 0;
            for (var i = 0; i < rowCells.length; i++) {
                if (rowCells[i] === targetCell) {
                    columnNumber = i;
                }
            }
           
            /* Ensure that specific parts of the table arent registered as selections, i.e.
             * the first column and the headers */
            if (targetCell.nodeName === 'TABLE' || targetCell.nodeName === 'TH' || columnNumber === 0) {
                return;
            }
            
            setSelectionsVisible(targetCell);
            addAndRemoveSelections(targetCell, columnNumber, rowCells);
        
        } // End handler
        
        /* Add/remove the selection visibility (indicated with colored cell) */
        function setSelectionsVisible(targetCell){
            
            /* Detect and set selection visibility with CSS */
            if (targetCell.style.backgroundColor === "rgb(9, 218, 160)") {
                targetCell.style.backgroundColor = null;
                //remove the day and time from the selection list
            } else {
                targetCell.style.backgroundColor = "rgb(9, 218, 160)";     
            }     
            
        } // End setSelectionsVisible
        
        /* Add/remove seleletions from the hold */
        function addAndRemoveSelections(targetCell, columnNumber, rowCells){
            
            /*  */
            var tableIdString = targetCell.parentNode.parentNode.parentNode.getAttribute("id");
            var tableIdActual = document.getElementById(tableIdString);
            //var day = tableIdActual.rows[0].cells[columnNumber].innerHTML;
            var id = tableIdActual.rows[0].cells[columnNumber].getAttribute("id");
            var time = rowCells[0].parentNode.getAttribute("id");
           
            var identifier = id + " " + time;
            
            console.log(identifier);
            
            /* Check if the selection doesn't exist. If its doesn't, store (create) the shift. 
             * Otherwise, remove it as a stored selection */
            if (document.getElementById(identifier) === null) {

                //alert("doesn't exist, so create");
                $("#shifts").append("<input name='shifts' class='shift' id='" + identifier + "' type='text' value='" + identifier + "'/>");

                //' style='display: none'
            } else {

                var element = document.getElementById(identifier);
                element.parentNode.removeChild(element);
            
            }
                        
        } // End addAndRemoveSelections
        
        
    }

    pub.setup = function () {

        setupTask();
       
    };

    return pub;

}());

$(document).ready(selections.setup);