// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureMachineLearningWebServiceOutputColumnResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMachineLearningWebServiceOutputColumnResponse Empty = new AzureMachineLearningWebServiceOutputColumnResponse();

    @InputImport(name="dataType")
    private final @Nullable String dataType;

    public Optional<String> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public AzureMachineLearningWebServiceOutputColumnResponse(
        @Nullable String dataType,
        @Nullable String name) {
        this.dataType = dataType;
        this.name = name;
    }

    private AzureMachineLearningWebServiceOutputColumnResponse() {
        this.dataType = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceOutputColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceOutputColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.name = defaults.name;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public AzureMachineLearningWebServiceOutputColumnResponse build() {
            return new AzureMachineLearningWebServiceOutputColumnResponse(dataType, name);
        }
    }
}
