// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeDataCatalogInputDefinitionArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeS3LocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Secondary input
 * 
 */
public final class RecipeSecondaryInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeSecondaryInputArgs Empty = new RecipeSecondaryInputArgs();

    @Import(name="dataCatalogInputDefinition")
      private final @Nullable Output<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;

    public Output<RecipeDataCatalogInputDefinitionArgs> getDataCatalogInputDefinition() {
        return this.dataCatalogInputDefinition == null ? Codegen.empty() : this.dataCatalogInputDefinition;
    }

    @Import(name="s3InputDefinition")
      private final @Nullable Output<RecipeS3LocationArgs> s3InputDefinition;

    public Output<RecipeS3LocationArgs> getS3InputDefinition() {
        return this.s3InputDefinition == null ? Codegen.empty() : this.s3InputDefinition;
    }

    public RecipeSecondaryInputArgs(
        @Nullable Output<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition,
        @Nullable Output<RecipeS3LocationArgs> s3InputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
        this.s3InputDefinition = s3InputDefinition;
    }

    private RecipeSecondaryInputArgs() {
        this.dataCatalogInputDefinition = Codegen.empty();
        this.s3InputDefinition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeSecondaryInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;
        private @Nullable Output<RecipeS3LocationArgs> s3InputDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeSecondaryInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogInputDefinition = defaults.dataCatalogInputDefinition;
    	      this.s3InputDefinition = defaults.s3InputDefinition;
        }

        public Builder dataCatalogInputDefinition(@Nullable Output<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }
        public Builder dataCatalogInputDefinition(@Nullable RecipeDataCatalogInputDefinitionArgs dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = Codegen.ofNullable(dataCatalogInputDefinition);
            return this;
        }
        public Builder s3InputDefinition(@Nullable Output<RecipeS3LocationArgs> s3InputDefinition) {
            this.s3InputDefinition = s3InputDefinition;
            return this;
        }
        public Builder s3InputDefinition(@Nullable RecipeS3LocationArgs s3InputDefinition) {
            this.s3InputDefinition = Codegen.ofNullable(s3InputDefinition);
            return this;
        }        public RecipeSecondaryInputArgs build() {
            return new RecipeSecondaryInputArgs(dataCatalogInputDefinition, s3InputDefinition);
        }
    }
}
