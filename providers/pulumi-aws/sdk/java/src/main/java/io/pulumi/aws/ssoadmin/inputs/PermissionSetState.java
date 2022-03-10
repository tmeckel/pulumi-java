// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionSetState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionSetState Empty = new PermissionSetState();

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The date the Permission Set was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @InputImport(name="createdDate")
      private final @Nullable Input<String> createdDate;

    public Input<String> getCreatedDate() {
        return this.createdDate == null ? Input.empty() : this.createdDate;
    }

    /**
     * The description of the Permission Set.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @InputImport(name="instanceArn")
      private final @Nullable Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn == null ? Input.empty() : this.instanceArn;
    }

    /**
     * The name of the Permission Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    @InputImport(name="relayState")
      private final @Nullable Input<String> relayState;

    public Input<String> getRelayState() {
        return this.relayState == null ? Input.empty() : this.relayState;
    }

    /**
     * The length of time that the application user sessions are valid in the ISO-8601 standard. Default: `PT1H`.
     * 
     */
    @InputImport(name="sessionDuration")
      private final @Nullable Input<String> sessionDuration;

    public Input<String> getSessionDuration() {
        return this.sessionDuration == null ? Input.empty() : this.sessionDuration;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public PermissionSetState(
        @Nullable Input<String> arn,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> description,
        @Nullable Input<String> instanceArn,
        @Nullable Input<String> name,
        @Nullable Input<String> relayState,
        @Nullable Input<String> sessionDuration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.description = description;
        this.instanceArn = instanceArn;
        this.name = name;
        this.relayState = relayState;
        this.sessionDuration = sessionDuration;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private PermissionSetState() {
        this.arn = Input.empty();
        this.createdDate = Input.empty();
        this.description = Input.empty();
        this.instanceArn = Input.empty();
        this.name = Input.empty();
        this.relayState = Input.empty();
        this.sessionDuration = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> description;
        private @Nullable Input<String> instanceArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> relayState;
        private @Nullable Input<String> sessionDuration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.relayState = defaults.relayState;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder createdDate(@Nullable Input<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Input.ofNullable(createdDate);
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

        public Builder instanceArn(@Nullable Input<String> instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }

        public Builder instanceArn(@Nullable String instanceArn) {
            this.instanceArn = Input.ofNullable(instanceArn);
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

        public Builder relayState(@Nullable Input<String> relayState) {
            this.relayState = relayState;
            return this;
        }

        public Builder relayState(@Nullable String relayState) {
            this.relayState = Input.ofNullable(relayState);
            return this;
        }

        public Builder sessionDuration(@Nullable Input<String> sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }

        public Builder sessionDuration(@Nullable String sessionDuration) {
            this.sessionDuration = Input.ofNullable(sessionDuration);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public PermissionSetState build() {
            return new PermissionSetState(arn, createdDate, description, instanceArn, name, relayState, sessionDuration, tags, tagsAll);
        }
    }
}
