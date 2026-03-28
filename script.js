// 1. Inicializar los iconos de Lucide
document.addEventListener('DOMContentLoaded', () => {
    lucide.createIcons();
});

// 2. Lógica para el Formulario de Contacto
const contactoForm = document.querySelector('form');

if (contactoForm) {
    contactoForm.addEventListener('submit', (e) => {
        e.preventDefault(); // Evita que la página se recargue
        
        // Aquí simulamos el envío (esto lo conectarás luego con Java)
        alert('¡Gracias José! Tu mensaje ha sido enviado con éxito (Simulación).');
        contactoForm.reset();
    });
}