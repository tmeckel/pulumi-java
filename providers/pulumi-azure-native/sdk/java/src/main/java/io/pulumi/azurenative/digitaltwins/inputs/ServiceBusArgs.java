// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties related to ServiceBus.
 * 
 */
public final class ServiceBusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusArgs Empty = new ServiceBusArgs();

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,AuthenticationType>> authenticationType;

    public Output<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Codegen.empty() : this.authenticationType;
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="deadLetterSecret")
      private final @Nullable Output<String> deadLetterSecret;

    public Output<String> getDeadLetterSecret() {
        return this.deadLetterSecret == null ? Codegen.empty() : this.deadLetterSecret;
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @Import(name="deadLetterUri")
      private final @Nullable Output<String> deadLetterUri;

    public Output<String> getDeadLetterUri() {
        return this.deadLetterUri == null ? Codegen.empty() : this.deadLetterUri;
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is 'ServiceBus'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @Import(name="endpointUri")
      private final @Nullable Output<String> endpointUri;

    public Output<String> getEndpointUri() {
        return this.endpointUri == null ? Codegen.empty() : this.endpointUri;
    }

    /**
     * The ServiceBus Topic name for identity-based authentication
     * 
     */
    @Import(name="entityPath")
      private final @Nullable Output<String> entityPath;

    public Output<String> getEntityPath() {
        return this.entityPath == null ? Codegen.empty() : this.entityPath;
    }

    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="primaryConnectionString")
      private final @Nullable Output<String> primaryConnectionString;

    public Output<String> getPrimaryConnectionString() {
        return this.primaryConnectionString == null ? Codegen.empty() : this.primaryConnectionString;
    }

    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="secondaryConnectionString")
      private final @Nullable Output<String> secondaryConnectionString;

    public Output<String> getSecondaryConnectionString() {
        return this.secondaryConnectionString == null ? Codegen.empty() : this.secondaryConnectionString;
    }

    public ServiceBusArgs(
        @Nullable Output<Either<String,AuthenticationType>> authenticationType,
        @Nullable Output<String> deadLetterSecret,
        @Nullable Output<String> deadLetterUri,
        Output<String> endpointType,
        @Nullable Output<String> endpointUri,
        @Nullable Output<String> entityPath,
        @Nullable Output<String> primaryConnectionString,
        @Nullable Output<String> secondaryConnectionString) {
        this.authenticationType = authenticationType;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.primaryConnectionString = primaryConnectionString;
        this.secondaryConnectionString = secondaryConnectionString;
    }

    private ServiceBusArgs() {
        this.authenticationType = Codegen.empty();
        this.deadLetterSecret = Codegen.empty();
        this.deadLetterUri = Codegen.empty();
        this.endpointType = Codegen.empty();
        this.endpointUri = Codegen.empty();
        this.entityPath = Codegen.empty();
        this.primaryConnectionString = Codegen.empty();
        this.secondaryConnectionString = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Output<String> deadLetterSecret;
        private @Nullable Output<String> deadLetterUri;
        private Output<String> endpointType;
        private @Nullable Output<String> endpointUri;
        private @Nullable Output<String> entityPath;
        private @Nullable Output<String> primaryConnectionString;
        private @Nullable Output<String> secondaryConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
        }

        public Builder authenticationType(@Nullable Output<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Codegen.ofNullable(authenticationType);
            return this;
        }
        public Builder deadLetterSecret(@Nullable Output<String> deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }
        public Builder deadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = Codegen.ofNullable(deadLetterSecret);
            return this;
        }
        public Builder deadLetterUri(@Nullable Output<String> deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }
        public Builder deadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = Codegen.ofNullable(deadLetterUri);
            return this;
        }
        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = Codegen.ofNullable(endpointUri);
            return this;
        }
        public Builder entityPath(@Nullable Output<String> entityPath) {
            this.entityPath = entityPath;
            return this;
        }
        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = Codegen.ofNullable(entityPath);
            return this;
        }
        public Builder primaryConnectionString(@Nullable Output<String> primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }
        public Builder primaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = Codegen.ofNullable(primaryConnectionString);
            return this;
        }
        public Builder secondaryConnectionString(@Nullable Output<String> secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }
        public Builder secondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = Codegen.ofNullable(secondaryConnectionString);
            return this;
        }        public ServiceBusArgs build() {
            return new ServiceBusArgs(authenticationType, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath, primaryConnectionString, secondaryConnectionString);
        }
    }
}
