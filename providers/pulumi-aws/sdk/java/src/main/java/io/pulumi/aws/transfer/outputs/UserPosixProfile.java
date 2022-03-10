// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPosixProfile {
    /**
     * The POSIX group ID used for all EFS operations by this user.
     * 
     */
    private final Integer gid;
    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     * 
     */
    private final @Nullable List<Integer> secondaryGids;
    /**
     * The POSIX user ID used for all EFS operations by this user.
     * 
     */
    private final Integer uid;

    @OutputCustomType.Constructor
    private UserPosixProfile(
        @OutputCustomType.Parameter("gid") Integer gid,
        @OutputCustomType.Parameter("secondaryGids") @Nullable List<Integer> secondaryGids,
        @OutputCustomType.Parameter("uid") Integer uid) {
        this.gid = gid;
        this.secondaryGids = secondaryGids;
        this.uid = uid;
    }

    /**
     * The POSIX group ID used for all EFS operations by this user.
     * 
    */
    public Integer getGid() {
        return this.gid;
    }
    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     * 
    */
    public List<Integer> getSecondaryGids() {
        return this.secondaryGids == null ? List.of() : this.secondaryGids;
    }
    /**
     * The POSIX user ID used for all EFS operations by this user.
     * 
    */
    public Integer getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPosixProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer gid;
        private @Nullable List<Integer> secondaryGids;
        private Integer uid;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPosixProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        public Builder gid(Integer gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }

        public Builder secondaryGids(@Nullable List<Integer> secondaryGids) {
            this.secondaryGids = secondaryGids;
            return this;
        }

        public Builder uid(Integer uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public UserPosixProfile build() {
            return new UserPosixProfile(gid, secondaryGids, uid);
        }
    }
}
