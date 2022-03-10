// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntryBigqueryTableSpecTableSpec {
    private final @Nullable String groupedEntry;

    @OutputCustomType.Constructor
    private EntryBigqueryTableSpecTableSpec(@OutputCustomType.Parameter("groupedEntry") @Nullable String groupedEntry) {
        this.groupedEntry = groupedEntry;
    }

    public Optional<String> getGroupedEntry() {
        return Optional.ofNullable(this.groupedEntry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecTableSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupedEntry;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecTableSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        public Builder groupedEntry(@Nullable String groupedEntry) {
            this.groupedEntry = groupedEntry;
            return this;
        }
        public EntryBigqueryTableSpecTableSpec build() {
            return new EntryBigqueryTableSpecTableSpec(groupedEntry);
        }
    }
}
