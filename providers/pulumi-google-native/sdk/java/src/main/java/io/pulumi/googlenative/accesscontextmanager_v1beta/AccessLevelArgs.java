// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.BasicLevelArgs;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.CustomLevelArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelArgs Empty = new AccessLevelArgs();

    @InputImport(name="accessPolicyId", required=true)
    private final Input<String> accessPolicyId;

    public Input<String> getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * A `BasicLevel` composed of `Conditions`.
     * 
     */
    @InputImport(name="basic")
    private final @Nullable Input<BasicLevelArgs> basic;

    public Input<BasicLevelArgs> getBasic() {
        return this.basic == null ? Input.empty() : this.basic;
    }

    /**
     * A `CustomLevel` written in the Common Expression Language.
     * 
     */
    @InputImport(name="custom")
    private final @Nullable Input<CustomLevelArgs> custom;

    public Input<CustomLevelArgs> getCustom() {
        return this.custom == null ? Input.empty() : this.custom;
    }

    /**
     * Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`. The maximum length // of the `short_name` component is 50 characters.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public AccessLevelArgs(
        Input<String> accessPolicyId,
        @Nullable Input<BasicLevelArgs> basic,
        @Nullable Input<CustomLevelArgs> custom,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> title) {
        this.accessPolicyId = Objects.requireNonNull(accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
        this.basic = basic;
        this.custom = custom;
        this.description = description;
        this.name = name;
        this.title = title;
    }

    private AccessLevelArgs() {
        this.accessPolicyId = Input.empty();
        this.basic = Input.empty();
        this.custom = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessPolicyId;
        private @Nullable Input<BasicLevelArgs> basic;
        private @Nullable Input<CustomLevelArgs> custom;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyId = defaults.accessPolicyId;
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
        }

        public Builder setAccessPolicyId(Input<String> accessPolicyId) {
            this.accessPolicyId = Objects.requireNonNull(accessPolicyId);
            return this;
        }

        public Builder setAccessPolicyId(String accessPolicyId) {
            this.accessPolicyId = Input.of(Objects.requireNonNull(accessPolicyId));
            return this;
        }

        public Builder setBasic(@Nullable Input<BasicLevelArgs> basic) {
            this.basic = basic;
            return this;
        }

        public Builder setBasic(@Nullable BasicLevelArgs basic) {
            this.basic = Input.ofNullable(basic);
            return this;
        }

        public Builder setCustom(@Nullable Input<CustomLevelArgs> custom) {
            this.custom = custom;
            return this;
        }

        public Builder setCustom(@Nullable CustomLevelArgs custom) {
            this.custom = Input.ofNullable(custom);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public AccessLevelArgs build() {
            return new AccessLevelArgs(accessPolicyId, basic, custom, description, name, title);
        }
    }
}
