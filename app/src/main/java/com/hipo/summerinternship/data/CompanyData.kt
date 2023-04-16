package com.hipo.summerinternship.data

import com.hipo.summerinternship.model.CompanyModel
import com.hipo.summerinternship.model.HipoModel
import com.hipo.summerinternship.model.MemberModel

val company = CompanyModel(
    company = "Hipo",
    team = "Android",
    members = mutableListOf(
        MemberModel(
            name = "Yasin Cetiner",
            age = 33,
            location = "Istanbul",
            github = "artizco",
            hipo = HipoModel(
                position = "Android Team Lead",
                yearsInHipo = 5,
            ),
        ),
        MemberModel(
            name = "Mithat Sinan Sari",
            age = 29,
            location = "İstanbul",
            github = "mitsinsar",
            hipo = HipoModel(
                position = "Android Developer",
                yearsInHipo = 4,
            ),
        ),
        MemberModel(
            name = "Miraç Özkan",
            age = 25,
            location = "İstanbul",
            github = "miracozkan",
            hipo = HipoModel(
                position = "Android Developer",
                yearsInHipo = 3,
            ),
        ),
        MemberModel(
            name = "Onuralp Avcı",
            age = 23,
            location = "Ankara",
            github = "onuralpavci",
            hipo = HipoModel(
                position = "Android Developer",
                yearsInHipo = 2,
            ),
        ),
    ) as ArrayList<MemberModel>,
)

val newMemberData = MemberModel(
    name = "Atilla Türkmen",
    age = 22,
    location = "İstanbul",
    github = "atillaturkmen",
    hipo = HipoModel(
        position = "Intern",
        yearsInHipo = 0,
    ),
)
