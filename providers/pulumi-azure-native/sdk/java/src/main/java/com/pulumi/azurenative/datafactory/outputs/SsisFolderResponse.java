// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisFolderResponse {
    /**
     * @return Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Metadata id.
     * 
     */
    private final @Nullable Double id;
    /**
     * @return Metadata name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The type of SSIS object metadata.
     * Expected value is &#39;Folder&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SsisFolderResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable Double id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * @return Metadata description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Metadata id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Metadata name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of SSIS object metadata.
     * Expected value is &#39;Folder&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisFolderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double id;
        private @Nullable String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisFolderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SsisFolderResponse build() {
            return new SsisFolderResponse(description, id, name, type);
        }
    }
}
