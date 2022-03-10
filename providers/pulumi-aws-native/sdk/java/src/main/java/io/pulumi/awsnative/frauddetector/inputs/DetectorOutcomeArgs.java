// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorOutcomeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorOutcomeArgs Empty = new DetectorOutcomeArgs();

    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The time when the outcome was created.
     * 
     */
    @InputImport(name="createdTime")
      private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="inline")
      private final @Nullable Input<Boolean> inline;

    public Input<Boolean> getInline() {
        return this.inline == null ? Input.empty() : this.inline;
    }

    /**
     * The time when the outcome was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
      private final @Nullable Input<String> lastUpdatedTime;

    public Input<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Input.empty() : this.lastUpdatedTime;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags associated with this outcome.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DetectorTagArgs>> tags;

    public Input<List<DetectorTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DetectorOutcomeArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> createdTime,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> inline,
        @Nullable Input<String> lastUpdatedTime,
        @Nullable Input<String> name,
        @Nullable Input<List<DetectorTagArgs>> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    private DetectorOutcomeArgs() {
        this.arn = Input.empty();
        this.createdTime = Input.empty();
        this.description = Input.empty();
        this.inline = Input.empty();
        this.lastUpdatedTime = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorOutcomeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> inline;
        private @Nullable Input<String> lastUpdatedTime;
        private @Nullable Input<String> name;
        private @Nullable Input<List<DetectorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorOutcomeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder createdTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
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

        public Builder inline(@Nullable Input<Boolean> inline) {
            this.inline = inline;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            this.inline = Input.ofNullable(inline);
            return this;
        }

        public Builder lastUpdatedTime(@Nullable Input<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Input.ofNullable(lastUpdatedTime);
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

        public Builder tags(@Nullable Input<List<DetectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<DetectorTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DetectorOutcomeArgs build() {
            return new DetectorOutcomeArgs(arn, createdTime, description, inline, lastUpdatedTime, name, tags);
        }
    }
}
