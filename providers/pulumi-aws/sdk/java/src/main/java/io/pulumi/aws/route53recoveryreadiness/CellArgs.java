// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CellArgs extends io.pulumi.resources.ResourceArgs {

    public static final CellArgs Empty = new CellArgs();

    /**
     * Unique name describing the cell.
     * 
     */
    @Import(name="cellName", required=true)
      private final Output<String> cellName;

    public Output<String> getCellName() {
        return this.cellName;
    }

    /**
     * List of cell arns to add as nested fault domains within this cell.
     * 
     */
    @Import(name="cells")
      private final @Nullable Output<List<String>> cells;

    public Output<List<String>> getCells() {
        return this.cells == null ? Codegen.empty() : this.cells;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CellArgs(
        Output<String> cellName,
        @Nullable Output<List<String>> cells,
        @Nullable Output<Map<String,String>> tags) {
        this.cellName = Objects.requireNonNull(cellName, "expected parameter 'cellName' to be non-null");
        this.cells = cells;
        this.tags = tags;
    }

    private CellArgs() {
        this.cellName = Codegen.empty();
        this.cells = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cellName;
        private @Nullable Output<List<String>> cells;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CellArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellName = defaults.cellName;
    	      this.cells = defaults.cells;
    	      this.tags = defaults.tags;
        }

        public Builder cellName(Output<String> cellName) {
            this.cellName = Objects.requireNonNull(cellName);
            return this;
        }
        public Builder cellName(String cellName) {
            this.cellName = Output.of(Objects.requireNonNull(cellName));
            return this;
        }
        public Builder cells(@Nullable Output<List<String>> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(@Nullable List<String> cells) {
            this.cells = Codegen.ofNullable(cells);
            return this;
        }
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CellArgs build() {
            return new CellArgs(cellName, cells, tags);
        }
    }
}
