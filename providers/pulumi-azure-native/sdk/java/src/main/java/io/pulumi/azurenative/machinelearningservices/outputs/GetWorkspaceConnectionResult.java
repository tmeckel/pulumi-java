// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceConnectionResult {
    /**
     * Authorization type of the workspace connection.
     * 
     */
    private final @Nullable String authType;
    /**
     * Category of the workspace connection.
     * 
     */
    private final @Nullable String category;
    /**
     * ResourceId of the workspace connection.
     * 
     */
    private final String id;
    /**
     * Friendly name of the workspace connection.
     * 
     */
    private final String name;
    /**
     * Target of the workspace connection.
     * 
     */
    private final @Nullable String target;
    /**
     * Resource type of workspace connection.
     * 
     */
    private final String type;
    /**
     * Value details of the workspace connection.
     * 
     */
    private final @Nullable String value;
    /**
     * format for the workspace connection value
     * 
     */
    private final @Nullable String valueFormat;

    @OutputCustomType.Constructor
    private GetWorkspaceConnectionResult(
        @OutputCustomType.Parameter("authType") @Nullable String authType,
        @OutputCustomType.Parameter("category") @Nullable String category,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("target") @Nullable String target,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("value") @Nullable String value,
        @OutputCustomType.Parameter("valueFormat") @Nullable String valueFormat) {
        this.authType = authType;
        this.category = category;
        this.id = id;
        this.name = name;
        this.target = target;
        this.type = type;
        this.value = value;
        this.valueFormat = valueFormat;
    }

    /**
     * Authorization type of the workspace connection.
     * 
    */
    public Optional<String> getAuthType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * Category of the workspace connection.
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * ResourceId of the workspace connection.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Friendly name of the workspace connection.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Target of the workspace connection.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Resource type of workspace connection.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value details of the workspace connection.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }
    /**
     * format for the workspace connection value
     * 
    */
    public Optional<String> getValueFormat() {
        return Optional.ofNullable(this.valueFormat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authType;
        private @Nullable String category;
        private String id;
        private String name;
        private @Nullable String target;
        private String type;
        private @Nullable String value;
        private @Nullable String valueFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.category = defaults.category;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.valueFormat = defaults.valueFormat;
        }

        public Builder authType(@Nullable String authType) {
            this.authType = authType;
            return this;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
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

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder valueFormat(@Nullable String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public GetWorkspaceConnectionResult build() {
            return new GetWorkspaceConnectionResult(authType, category, id, name, target, type, value, valueFormat);
        }
    }
}
