class BasicFragment : Fragment(R.layout.fragment_basic) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler = view.findViewById<RecyclerView>(R.id.recyclerView)
        recycler.layoutManager = LinearLayoutManager(requireContext())

        val data = listOf(
            CardItem("Card 1"),
            CardItem("Card 2"),
            CardItem("Card 3"),
            CardItem("Card 4"),
            CardItem("Card 5")
        )

        recycler.adapter = CardAdapter(data)
    }
}
