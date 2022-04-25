// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupMembershipsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupMembershipsArgs Empty = new GetGroupMembershipsArgs();

    /**
     * The parent Group resource under which to lookup the Membership names. Must be of the form groups/{group_id}.
     * 
     */
    @Import(name="group", required=true)
    private String group;

    /**
     * @return The parent Group resource under which to lookup the Membership names. Must be of the form groups/{group_id}.
     * 
     */
    public String group() {
        return this.group;
    }

    private GetGroupMembershipsArgs() {}

    private GetGroupMembershipsArgs(GetGroupMembershipsArgs $) {
        this.group = $.group;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupMembershipsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupMembershipsArgs $;

        public Builder() {
            $ = new GetGroupMembershipsArgs();
        }

        public Builder(GetGroupMembershipsArgs defaults) {
            $ = new GetGroupMembershipsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The parent Group resource under which to lookup the Membership names. Must be of the form groups/{group_id}.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            $.group = group;
            return this;
        }

        public GetGroupMembershipsArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            return $;
        }
    }

}
