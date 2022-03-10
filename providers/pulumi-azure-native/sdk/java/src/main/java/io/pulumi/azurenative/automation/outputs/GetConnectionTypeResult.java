// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.FieldDefinitionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionTypeResult {
    /**
     * Gets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets the field definitions of the connection type.
     * 
     */
    private final Map<String,FieldDefinitionResponse> fieldDefinitions;
    /**
     * Gets the id of the resource.
     * 
     */
    private final String id;
    /**
     * Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    private final @Nullable Boolean isGlobal;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * Gets the name of the connection type.
     * 
     */
    private final String name;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetConnectionTypeResult(
        @OutputCustomType.Parameter("creationTime") String creationTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("fieldDefinitions") Map<String,FieldDefinitionResponse> fieldDefinitions,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isGlobal") @Nullable Boolean isGlobal,
        @OutputCustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type) {
        this.creationTime = creationTime;
        this.description = description;
        this.fieldDefinitions = fieldDefinitions;
        this.id = id;
        this.isGlobal = isGlobal;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets the field definitions of the connection type.
     * 
    */
    public Map<String,FieldDefinitionResponse> getFieldDefinitions() {
        return this.fieldDefinitions;
    }
    /**
     * Gets the id of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets a Boolean value to indicate if the connection type is global.
     * 
    */
    public Optional<Boolean> getIsGlobal() {
        return Optional.ofNullable(this.isGlobal);
    }
    /**
     * Gets or sets the last modified time.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * Gets the name of the connection type.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable String description;
        private Map<String,FieldDefinitionResponse> fieldDefinitions;
        private String id;
        private @Nullable Boolean isGlobal;
        private @Nullable String lastModifiedTime;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.fieldDefinitions = defaults.fieldDefinitions;
    	      this.id = defaults.id;
    	      this.isGlobal = defaults.isGlobal;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder fieldDefinitions(Map<String,FieldDefinitionResponse> fieldDefinitions) {
            this.fieldDefinitions = Objects.requireNonNull(fieldDefinitions);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isGlobal(@Nullable Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectionTypeResult build() {
            return new GetConnectionTypeResult(creationTime, description, fieldDefinitions, id, isGlobal, lastModifiedTime, name, type);
        }
    }
}
