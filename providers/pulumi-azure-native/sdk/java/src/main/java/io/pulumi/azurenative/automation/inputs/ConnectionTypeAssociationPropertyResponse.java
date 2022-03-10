// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The connection type property associated with the entity.
 * 
 */
public final class ConnectionTypeAssociationPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionTypeAssociationPropertyResponse Empty = new ConnectionTypeAssociationPropertyResponse();

    /**
     * Gets or sets the name of the connection type.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public ConnectionTypeAssociationPropertyResponse(@Nullable String name) {
        this.name = name;
    }

    private ConnectionTypeAssociationPropertyResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionTypeAssociationPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionTypeAssociationPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ConnectionTypeAssociationPropertyResponse build() {
            return new ConnectionTypeAssociationPropertyResponse(name);
        }
    }
}
