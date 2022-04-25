// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserGroupArgs Empty = new GetUserGroupArgs();

    /**
     * The ID of the user group.
     * 
     */
    @Import(name="userGroupId", required=true)
    private String userGroupId;

    /**
     * @return The ID of the user group.
     * 
     */
    public String userGroupId() {
        return this.userGroupId;
    }

    private GetUserGroupArgs() {}

    private GetUserGroupArgs(GetUserGroupArgs $) {
        this.userGroupId = $.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserGroupArgs $;

        public Builder() {
            $ = new GetUserGroupArgs();
        }

        public Builder(GetUserGroupArgs defaults) {
            $ = new GetUserGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userGroupId The ID of the user group.
         * 
         * @return builder
         * 
         */
        public Builder userGroupId(String userGroupId) {
            $.userGroupId = userGroupId;
            return this;
        }

        public GetUserGroupArgs build() {
            $.userGroupId = Objects.requireNonNull($.userGroupId, "expected parameter 'userGroupId' to be non-null");
            return $;
        }
    }

}
