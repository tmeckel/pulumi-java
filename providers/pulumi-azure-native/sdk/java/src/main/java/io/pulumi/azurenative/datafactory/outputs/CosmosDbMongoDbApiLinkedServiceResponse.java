// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CosmosDbMongoDbApiLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The CosmosDB (MongoDB API) connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final Object connectionString;
    /**
     * The name of the CosmosDB (MongoDB API) database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    private final Object database;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * Whether the CosmosDB (MongoDB API) server version is higher than 3.2. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object isServerVersionAbove32;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Type of linked service.
     * Expected value is 'CosmosDbMongoDbApi'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private CosmosDbMongoDbApiLinkedServiceResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("connectionString") Object connectionString,
        @OutputCustomType.Parameter("database") Object database,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("isServerVersionAbove32") @Nullable Object isServerVersionAbove32,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.database = database;
        this.description = description;
        this.isServerVersionAbove32 = isServerVersionAbove32;
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The CosmosDB (MongoDB API) connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Object getConnectionString() {
        return this.connectionString;
    }
    /**
     * The name of the CosmosDB (MongoDB API) database that you want to access. Type: string (or Expression with resultType string).
     * 
    */
    public Object getDatabase() {
        return this.database;
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Whether the CosmosDB (MongoDB API) server version is higher than 3.2. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getIsServerVersionAbove32() {
        return Optional.ofNullable(this.isServerVersionAbove32);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Type of linked service.
     * Expected value is 'CosmosDbMongoDbApi'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbMongoDbApiLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object connectionString;
        private Object database;
        private @Nullable String description;
        private @Nullable Object isServerVersionAbove32;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbMongoDbApiLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.isServerVersionAbove32 = defaults.isServerVersionAbove32;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectionString(Object connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder database(Object database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder isServerVersionAbove32(@Nullable Object isServerVersionAbove32) {
            this.isServerVersionAbove32 = isServerVersionAbove32;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CosmosDbMongoDbApiLinkedServiceResponse build() {
            return new CosmosDbMongoDbApiLinkedServiceResponse(annotations, connectVia, connectionString, database, description, isServerVersionAbove32, parameters, type);
        }
    }
}
