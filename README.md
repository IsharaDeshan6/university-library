# University Library 📚

[![TypeScript](https://img.shields.io/badge/TypeScript-blue.svg)](https://www.typescriptlang.org/)
[![React](https://img.shields.io/badge/React-20232A?style=flat&logo=react&logoColor=61DAFB)](https://reactjs.org/)
[![Next.js](https://img.shields.io/badge/Next.js-000000?style=flat&logo=nextdotjs&logoColor=white)](https://nextjs.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


## Description 📖

The University Library project is a web application built with Next.js, React, and TypeScript, designed to manage and provide access to library resources. It features user authentication, a book catalog, and administrative functionalities for managing users, books, and borrowing records. The application uses ImageKit for image uploads and Drizzle ORM for database interactions. The UI components are styled to provide a user-friendly experience for both library users and administrators.

## Table of Contents 📑

- [Description](#description-📖)
- [Features](#features-✨)
- [Tech Stack](#tech-stack-💻)
- [Installation](#installation-⚙️)
- [Usage](#usage-💡)
- [Project Structure](#project-structure-📂)
- [Contributing](#contributing-🤝)
- [License](#license-⚖️)
- [Important Links](#important-links-🔗)
- [Footer](#footer-📝)

## Features ✨

- **User Authentication:** Sign-up and sign-in functionality for library users.
- **Book Catalog:** Display of available books with details like title, author, genre, and availability. 📚
- **Admin Dashboard:** Management of users, books, and borrow records. 🧑‍💼
- **Image Upload:** University ID card upload using ImageKit. 🖼️
- **Borrowing System:** Functionality to borrow books (implementation details may vary). 📤
- **Role-Based Access:** Differentiated access for users and administrators. 🛡️
- **UI Components:** Reusable UI components for forms, book cards, and layouts. 🎨

## Tech Stack 💻

- **Frontend:**
    - [React](https://reactjs.org/) - A JavaScript library for building user interfaces.
    - [Next.js](https://nextjs.org/) - A React framework for building server-rendered and static web applications.
    - [TypeScript](https://www.typescriptlang.org/) - A typed superset of JavaScript.
    - [ImageKit](https://www.imagekit.io/) - For image management and uploads.
- **Backend:**
    - [Node.js](https://nodejs.org/en) - JavaScript runtime environment.
- **Database:**
    - [PostgreSQL](https://www.postgresql.org/) - Relational database.
    - [Drizzle ORM](https://orm.drizzle.team/) - TypeScript ORM for type-safe database access.

## Installation ⚙️

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/IsharaDeshan6/university-library.git
    cd university-library
    ```

2.  **Install dependencies:**

    ```bash
    npm install # or yarn install or pnpm install
    ```

3.  **Set up environment variables:**

    Create a `.env.local` file in the root directory and add the following environment variables:

    ```
    NEXT_PUBLIC_API_ENDPOINT=<Your API Endpoint>
    NEXT_PUBLIC_IMAGEKIT_PUBLIC_KEY=<Your ImageKit Public Key>
    NEXT_PUBLIC_IMAGEKIT_URL_ENDPOINT=<Your ImageKit URL Endpoint>
    IMAGEKIT_PRIVATE_KEY=<Your ImageKit Private Key>
    DATABASE_URL=<Your PostgreSQL Database URL>
    ```

4.  **Database Setup:**

    Run the database migrations using Drizzle:

    ```bash
    npx drizzle-kit generate:pg
    npx drizzle-kit push:pg
    ```

## Usage 💡

1.  **Start the development server:**

    ```bash
    npm run dev # or yarn dev or pnpm dev
    ```

2.  **Access the application:**

    Open your browser and navigate to `http://localhost:3000`.

### Key Use Cases 🏢

*   **Browsing the Library Catalog:** Users can browse through the available books, view details, and check availability.
*   **User Authentication:** New users can sign up, and existing users can sign in to access library resources.
*   **Admin Management:** Administrators can manage users, books, and borrowing records through the admin dashboard.

## Project Structure 📂

```
Next_JS_My_Projects/
└── university-library/
    ├── app/
    │   ├── (auth)/
    │   │   ├── layout.tsx
    │   │   ├── sign-in/
    │   │   │   └── page.tsx
    │   │   └── sign-up/
    │   │       └── page.tsx
    │   └── (root)/
    │       └── layout.tsx
    │   └── api/
    │       └── auth/
    │           └── imagekit/
    │               └── route.ts
    ├── components/
    │   ├── AuthForm.tsx
    │   ├── BookCard.tsx
    │   ├── BookCover.tsx
    │   ├── BookCoverSvg.tsx
    │   ├── BookList.tsx
    │   ├── BookOverview.tsx
    │   ├── Header.tsx
    │   └── ImageUpload.tsx
    ├── constants/
    │   └── index.ts
    ├── database/
    │   ├── drizzle.ts
    │   └── schema.ts
    ├── lib/
    │   ├── config.ts
    │   └── validations.ts
    ├── public/
    │   ├── books.json
    │   └── images/
    ├── drizzle.config.ts
    └── types.d.ts
```

## Contributing 🤝

Contributions are welcome! Please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them.
4.  Submit a pull request.

## License ⚖️

This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/licenses/MIT) file for details.

## Important Links 🔗

- **Repository Link**: [https://github.com/IsharaDeshan6/university-library](https://github.com/IsharaDeshan6/university-library)

## Footer 📝





--- 








**University Library** 📚 | [GitHub Repository](https://github.com/IsharaDeshan6/university-library) | Made with ❤️ by IsharaDeshan6 |  Feel free to fork, contribute, and give a star! ⭐ | Report issues and suggestions [here](https://github.com/IsharaDeshan6/university-library/issues).

---
