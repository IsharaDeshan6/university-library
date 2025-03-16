"use client";
import React from 'react'
import AuthForm from "@/components/AuthForm";
import {signInSchema, signUpSchema} from "@/lib/validations";

const Page = () =>
    (
        <AuthForm
            type="SIGN_UP"
            schema={signUpSchema}
            defaultValues={{
                email: "",
                password: "",
                fullName: "",
                universityId: "",
                universityCard: ""
            }}
        />
    )


export default Page
