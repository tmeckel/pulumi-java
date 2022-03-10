// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @InputImport(name="awsAccountId")
      private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    /**
     * A description for the group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A name for the group.
     * 
     */
    @InputImport(name="groupName", required=true)
      private final Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName;
    }

    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public GroupArgs(
        @Nullable Input<String> awsAccountId,
        @Nullable Input<String> description,
        Input<String> groupName,
        @Nullable Input<String> namespace) {
        this.awsAccountId = awsAccountId;
        this.description = description;
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.namespace = namespace;
    }

    private GroupArgs() {
        this.awsAccountId = Input.empty();
        this.description = Input.empty();
        this.groupName = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsAccountId;
        private @Nullable Input<String> description;
        private Input<String> groupName;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.description = defaults.description;
    	      this.groupName = defaults.groupName;
    	      this.namespace = defaults.namespace;
        }

        public Builder awsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder groupName(Input<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder groupName(String groupName) {
            this.groupName = Input.of(Objects.requireNonNull(groupName));
            return this;
        }

        public Builder namespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(awsAccountId, description, groupName, namespace);
        }
    }
}
