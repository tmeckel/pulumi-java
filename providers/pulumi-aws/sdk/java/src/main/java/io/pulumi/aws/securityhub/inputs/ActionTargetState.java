// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActionTargetState extends io.pulumi.resources.ResourceArgs {

    public static final ActionTargetState Empty = new ActionTargetState();

    /**
     * Amazon Resource Name (ARN) of the Security Hub custom action target.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the custom action target.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID for the custom action target.
     * 
     */
    @InputImport(name="identifier")
      private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * The description for the custom action target.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ActionTargetState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> identifier,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.description = description;
        this.identifier = identifier;
        this.name = name;
    }

    private ActionTargetState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.identifier = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionTargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder identifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder identifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ActionTargetState build() {
            return new ActionTargetState(arn, description, identifier, name);
        }
    }
}
