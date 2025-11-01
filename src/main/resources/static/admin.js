window.addEventListener("load", async () => {
    document.getElementById('player-form').addEventListener('submit', handlePlayerSubmit);
});

async function handlePlayerSubmit(e) {
    e.preventDefault();

    const form = e.target;
    const formData = new FormData(form);

    try {
        const response = await fetch(form.action, {
            method: 'POST',
            body: formData
        });

        if (!response.ok) throw new Error(`Server returned ${response.status}`);

        const result = await response.text();
        console.log('Success:', result);

        alert('Player added successfully!');
        window.location.reload();
    } catch (error) {
        console.error('Error submitting form:', error);
        alert('Error adding player');
    }
}
