// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPatchBaselineResult {
    private final @Nullable Boolean defaultBaseline;
    /**
     * The description of the baseline.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the baseline.
     * 
     */
    private final String name;
    private final @Nullable String namePrefix;
    private final @Nullable String operatingSystem;
    private final String owner;

    @OutputCustomType.Constructor
    private GetPatchBaselineResult(
        @OutputCustomType.Parameter("defaultBaseline") @Nullable Boolean defaultBaseline,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("namePrefix") @Nullable String namePrefix,
        @OutputCustomType.Parameter("operatingSystem") @Nullable String operatingSystem,
        @OutputCustomType.Parameter("owner") String owner) {
        this.defaultBaseline = defaultBaseline;
        this.description = description;
        this.id = id;
        this.name = name;
        this.namePrefix = namePrefix;
        this.operatingSystem = operatingSystem;
        this.owner = owner;
    }

    public Optional<Boolean> getDefaultBaseline() {
        return Optional.ofNullable(this.defaultBaseline);
    }
    /**
     * The description of the baseline.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the baseline.
     * 
    */
    public String getName() {
        return this.name;
    }
    public Optional<String> getNamePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    public Optional<String> getOperatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }
    public String getOwner() {
        return this.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchBaselineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean defaultBaseline;
        private String description;
        private String id;
        private String name;
        private @Nullable String namePrefix;
        private @Nullable String operatingSystem;
        private String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchBaselineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBaseline = defaults.defaultBaseline;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.owner = defaults.owner;
        }

        public Builder defaultBaseline(@Nullable Boolean defaultBaseline) {
            this.defaultBaseline = defaultBaseline;
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder operatingSystem(@Nullable String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public GetPatchBaselineResult build() {
            return new GetPatchBaselineResult(defaultBaseline, description, id, name, namePrefix, operatingSystem, owner);
        }
    }
}
