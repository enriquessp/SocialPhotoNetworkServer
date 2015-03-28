package com.company.speedment.orm.test.polaroid.db0.polaroid.follow;

import com.company.speedment.orm.test.polaroid.db0.polaroid.user.User;
import com.company.speedment.orm.test.polaroid.db0.polaroid.user.UserManager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table 'polaroid.db0.polaroid.follow'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface Follow {
    
    Long getFollower();
    
    String getFollows();
    
    default User findFollower() {
        return Platform.get().get(ManagerComponent.class)
                .manager(UserManager.class)
                .stream().filter(user -> Objects.equals(this.getFollower(), user.getId())).findAny().get();
    }
    
    default User findFollows() {
        return Platform.get().get(ManagerComponent.class)
                .manager(UserManager.class)
                .stream().filter(user -> Objects.equals(this.getFollows(), user.getId())).findAny().get();
    }
}