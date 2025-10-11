window.addEventListener("load", async () => {
    const leaderboardElement = document.getElementById('leaderboard');
    const response = await fetch('/players');
    const players = await response.json();

    players.forEach(player => {
        const listItem = document.createElement("li");
        listItem.textContent = `${player.firstName} ${player.lastName}`;
        leaderboardElement.appendChild(listItem);
    });
});