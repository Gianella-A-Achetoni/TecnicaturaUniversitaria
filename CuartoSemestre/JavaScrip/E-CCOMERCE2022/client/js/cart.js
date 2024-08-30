const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");
const cartBtn = document.getElementById("cart-btn");

// Función para crear el encabezado del modal
const createModalHeader = () => {
    const modalHeader = document.createElement("div");
    modalHeader.className = "modal-header"; // Asegúrate de que esta clase esté definida en tu CSS

    const modalClose = document.createElement("div");
    modalClose.innerText = "❌";
    modalClose.className = "modal-close";
    
    modalClose.addEventListener("click", closeModal);
    modalHeader.append(modalClose);

    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-title"; // Corregido de "modal-tittle" a "modal-title"

    modalHeader.append(modalTitle);
    return modalHeader;
};

// Función para mostrar el modal
const displayCart = () => {
    modalContainer.innerHTML = ""; // Limpiar contenido previo
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";

    const modalHeader = createModalHeader();
    modalContainer.append(modalHeader);

    // Aquí puedes agregar más contenido al modal, como los artículos del carrito.
};

// Función para cerrar el modal
const closeModal = () => {
    modalContainer.style.display = "none";
    modalOverlay.style.display = "none";
};

// Cerrar el modal al hacer clic en el overlay
modalOverlay.addEventListener("click", closeModal);

// Cerrar el modal con la tecla Esc
document.addEventListener("keydown", (event) => {
    if (event.key === "Escape") {
        closeModal();
    }
});

// Agregar el evento al botón del carrito
cartBtn.addEventListener("click", displayCart);