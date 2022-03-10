// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecViewSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecViewSpecGetArgs Empty = new EntryBigqueryTableSpecViewSpecGetArgs();

    @InputImport(name="viewQuery")
      private final @Nullable Input<String> viewQuery;

    public Input<String> getViewQuery() {
        return this.viewQuery == null ? Input.empty() : this.viewQuery;
    }

    public EntryBigqueryTableSpecViewSpecGetArgs(@Nullable Input<String> viewQuery) {
        this.viewQuery = viewQuery;
    }

    private EntryBigqueryTableSpecViewSpecGetArgs() {
        this.viewQuery = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecViewSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecViewSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder viewQuery(@Nullable Input<String> viewQuery) {
            this.viewQuery = viewQuery;
            return this;
        }

        public Builder viewQuery(@Nullable String viewQuery) {
            this.viewQuery = Input.ofNullable(viewQuery);
            return this;
        }
        public EntryBigqueryTableSpecViewSpecGetArgs build() {
            return new EntryBigqueryTableSpecViewSpecGetArgs(viewQuery);
        }
    }
}
