window.addEventListener("load", async () => {
    const leaderboardBodyElement = document.querySelector('#leaderboard tbody');
    const response = await fetch('/players');
    const players = await response.json();

    players.forEach((player, index) => {

        console.log(player)
        const listItem = document.createElement("tr");

        const rankTd = document.createElement("td");
        rankTd.textContent = index + 1;
        listItem.appendChild(rankTd);

        const nameTd = document.createElement("td");
        nameTd.textContent = `${player.firstName} ${player.lastName}`;
        listItem.appendChild(nameTd);

        const countryTd = document.createElement("td");
        countryTd.textContent = player.countryCode;
        listItem.appendChild(countryTd);

        const heightTd = document.createElement("td");
        const playerFeet = Math.trunc(player.heightInInches / 12);
        const playerInches = player.heightInInches % 12;
        heightTd.textContent = `${playerFeet}' ${playerInches}`;
        listItem.appendChild(heightTd);

        const numSubmissionsTd = document.createElement("td");
        numSubmissionsTd.textContent = player.numSubmissions;
        listItem.appendChild(numSubmissionsTd);


        leaderboardBodyElement.appendChild(listItem);
    });
});