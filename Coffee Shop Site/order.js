var myHeading = document.querySelector('h2');
var switchH1Btn = document.querySelector('#inputbutton');

	function changeTitle()	{
		myHeading.textContent = 'Thank you for your order!';
	}
			switchH1Btn.addEventListener('click', changeTitle);
	var bags = document.querySelector('select');
	var button = document.querySelector('#inputbutton');
	var total = document.querySelector('#totaldue');
	
			button.addEventListener("click", order);
		function order() {
			 var amount;
				amount = bags.value * 10 + bags.value * 10 * .07;
	if (bags.value >= 3) {
		amount = bags.value * 10 + bags.value * 10 * .07;
	} else {
		amount = bags.value * 10 + bags.value * 10 * .07 + 7;
	}
		total.value = amount;
		}
