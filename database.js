use spaceship
db.spaceship_description.drop()
db.crew_profile.drop()

db.createCollection( "spaceship_description", 
        {'system.serialNumber': {$type: "int"}},
        {'system.type': {$type: "string", $in: ["power_supply", "temperature_control", "control", "communication", "life_support", "orientation", "propulsion", "emergency_rescue"]}},
        {'system.requiredAccessLevel': {$type: "int", $range: [ 0, 10]}},
        {'system.serviceLife': {$type: "date"}},
        {'system.permissibleLoad': {$type: "int", $range: [ 100, 10000]}},
        {'system.loading': {$type: "int"}},
        {'system.idleFactor': {$type: "int"}},
        {'system.workStatus': {$type: "string", $in: ["ready", "not_ready"]}},
        {description: {$type: "string"}},
        {flightReadinessStatus: {$type: "string", $in: ["ready", "not_ready"]}}
)

db.spaceship_description.insert({
    system: {serialNumber: 2, type: "power_supply", requiredAccessLevel: 3, serviceLife: new Date(), permissibleLoad: 10, loading: 11, idleFactor:12, workStatus: "on"},
    description: "some text",
    flightReadinessStatus: "ready"
})

db.createCollection( "crew_profile", 
        {'personalData.fullName': {$type: "string"}},
        {'personalData.birthDate': {$type: "date"}},
        {'personalData.city': {$type: "string"}},
        {'personalData.requiredAccessLevel': {$type: "int", $range: [ 0, 10]}},
        {'personalData.specialSkills': {$type: "string"}},
        {expeditionMemberProfile: {$type: "string", $in: ["commander", "first_pilot", "navigator", "engineer", "cook", "physician", "payload_specialist", "passenger"]}},
        {responsibleForSystem: {$type: "int"}}
)

db.crew_profile.insert({
    personalData: {full_name: "Èâàíîâ Èâàí Èâàíîâè÷", birthDate: new Date(), city: "Moscow", requiredAccessLevel: 1, specialSkills: "Ð²Ð»Ð°Ð´ÐµÐµÑ‚ Ð±Ð¾ÐµÐ²Ð¾Ð¹ Ð¿Ð¾Ð´Ð³Ð¾Ñ‚Ð¾Ð²ÐºÐ¾Ð¹"},
    expeditionMemberProfile: "commander",
    responsibleForSystem: 2
})
