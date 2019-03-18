		function show() {
			var a = document.getElementById("txt1").value;
			var b = document.getElementById("txt2").value;
			document.getElementById("resut1").innerHTML = a.length;
			var n = (a.split(b)).length - 1;
			document.getElementById("resut2").innerHTML = n;
		}