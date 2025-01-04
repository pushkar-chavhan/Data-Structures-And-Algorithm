class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>unique=new HashSet<>();
        for(String email:emails){
            String []parts=email.split("@");
            String local=parts[0];
            String domain=parts[1];

            if(local.contains("+")){
                local=local.substring(0,local.indexOf("+"));
            }
            local=local.replace(".","");

            String NormalizedEmail=local+"@"+domain;
            unique.add(NormalizedEmail);
        }
        return  unique.size();
    }
}