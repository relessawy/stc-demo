public class OperationCommand
List status;
List allowed;
Status newStatus;
boolean setNewOwnerToUser;
So using the above we can use MVEL to declare the first entry for our DSL:
[   Operation.Claim
    : [ new OperationCommand().{
            status = [ Status.Ready ],
            allowed = [ Allowed.PotentialOwner, Allowed.BusinessAdministrator ],
            setNewOwnerToUser = true,       
            newStatus = Status.Reserved
        } ]
]