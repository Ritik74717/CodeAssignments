function resetForm(){
    let v= confirm("Are you sure")
    console.log(v)
    if(v){
    document.getElementsByClassName('fields').value=" "
    }
    else{
        return;
    }
}
function submitForm(event){
   
    var data="Name :- "+event.target.elements.name.value+" "+event.target.elements.lname.value+"\n"
     +"DOB :-"+event.target.elements.dob.value+"\n"+
     "Country :- "+event.target.elements.country.value+"\n"+
    "State :- "+event.target.elements.state.value+"\n"+
    "City :- "+event.target.elements.city.value+"\n"+
   "Gender :-"+event.target.elements.gender.value+"\n"+
    "Email :-"+event.target.elements.email.value+"\n"+
    "Profession :-"+event.target.elements.profession.value+"\n"+
    "Mobile:-"+event.target.elements.mobile.value+"\n"

    alert(data)
    return false;
    //confirm("Are you Sure")

}